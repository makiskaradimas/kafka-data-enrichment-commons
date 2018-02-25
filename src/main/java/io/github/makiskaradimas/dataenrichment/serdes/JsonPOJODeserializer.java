package io.github.makiskaradimas.dataenrichment.serdes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class JsonPOJODeserializer<T> implements Deserializer<T> {
    private ObjectMapper objectMapper = new ObjectMapper();
    private Class<T> tClass;

    public JsonPOJODeserializer() {
    }

    public void configure(Map<String, ?> props, boolean isKey) {
        this.tClass = (Class) props.get("JsonPOJOClass");
    }

    public T deserialize(String topic, byte[] bytes) {
        if (bytes == null) {
            return null;
        } else {
            try {
                T data = this.objectMapper.readValue(bytes, this.tClass);
                return data;
            } catch (Exception var5) {
                throw new SerializationException(var5);
            }
        }
    }

    public void close() {
    }
}
