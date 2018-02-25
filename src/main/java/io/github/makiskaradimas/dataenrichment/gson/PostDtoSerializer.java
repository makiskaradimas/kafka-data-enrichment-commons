package io.github.makiskaradimas.dataenrichment.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * @author Makis Karadimas
 */
public class PostDtoSerializer implements JsonSerializer<PostDto> {

    public JsonElement serialize(PostDto postDto, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject object = new JsonObject();
        object.addProperty("id", postDto.getId());
        object.addProperty("title", postDto.getTitle());
        object.addProperty("text", postDto.getText());
        object.addProperty("author", postDto.getAuthor());
        object.addProperty("category", postDto.getCategory());
        object.addProperty("status", postDto.getStatus());

        return object;
    }
}


