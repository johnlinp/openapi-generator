/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.client.model.Apple;
import org.openapitools.client.model.Banana;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GmFruit extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GmFruit.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GmFruit.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GmFruit' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            return (TypeAdapter<T>) new TypeAdapter<GmFruit>() {
                @Override
                public void write(JsonWriter out, GmFruit value) throws IOException {
                    throw new IOException("Failed to deserialize as the type doesn't match oneOf schemas: ");
                }

                @Override
                public GmFruit read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    int match = 0;

                    if (match == 1) {
                        GmFruit ret = new GmFruit();
                        ret.setActualInstance(deserialized);
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GmFruit: %d classes match result, expected 1", match));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GmFruit() {
        super("oneOf", Boolean.FALSE);
    }

    static {
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GmFruit.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * 
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        throw new RuntimeException("Invalid instance type. Must be ");
    }

    /**
     * Get the actual instance, which can be the following:
     * 
     *
     * @return The actual instance ()
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

}

