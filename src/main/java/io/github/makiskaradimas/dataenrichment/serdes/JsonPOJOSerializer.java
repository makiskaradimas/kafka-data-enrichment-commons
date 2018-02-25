package io.github.makiskaradimas.dataenrichment.serdes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class JsonPOJOSerializer<T> implements Serializer<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private Class<T> tClass;

    public JsonPOJOSerializer() {
    }

    public void configure(Map<String, ?> props, boolean isKey) {
        this.tClass = (Class) props.get("JsonPOJOClass");
    }

    public byte[] serialize(String topic, T data) {
        if (data == null) {
            return null;
        } else {
            try {
                return this.objectMapper.writeValueAsBytes(data);
            } catch (Exception var4) {
                throw new SerializationException("Error serializing JSON message", var4);
            }
        }
    }

    public void close() {
    }
}
