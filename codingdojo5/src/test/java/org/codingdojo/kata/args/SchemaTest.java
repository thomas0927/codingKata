/**
 * FileName: SchemaTest
 * Author: admin
 * Date: 2019/8/13 17:38
 */
package org.codingdojo.kata.args;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class SchemaTest {
    @ParameterizedTest(name="{index}=>{arguments}")
    @DisplayName("should get default value by schema")
    @MethodSource("schema_default")
    void should_get_default_value_by_schema(Schema schema,Object expected){

        assertEquals(schema.getValue(),expected);
    }

    private static Stream<Arguments> schema_default(){
    	return Stream.of(
    			Arguments.of(new Schema(Boolean.class,Boolean.FALSE),Boolean.FALSE),
    			Arguments.of(new Schema(Integer.class,0),0),
    			Arguments.of(new Schema(String.class,""),"")
    	);
    }
}
