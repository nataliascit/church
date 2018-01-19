package br.com.payment.management.core.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Class responsible for manipulating the data related to a JSON object.
 *
 * @author wcustodio
 */
public final class JSONUtil {

    /**
     * Prevents the class to be instantiated.
     */
    private JSONUtil() {}

    /**
     * Read a certain JSON file and map its value to a certain bean type.
     * @param path The of the file to be read.
     * @param type The {@link JavaType} used for the conversion.
     * @return The representation of the file content as a bean.
     * @throws IOException Error while reading the json file.
     */
    public static Object fileToBean(final String path, final JavaType type) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        final File file = new File(JSONUtil.class.getClass().getResource(path).getPath());
        return objectMapper.readValue(file, type);
    }
}
