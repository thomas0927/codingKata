package com.coding.dojo.args;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Schemas {
  private Map<Character, Schema> schemaMap;

  public Schemas(String schemasAsText) {
    this.schemaMap =
        Arrays.stream(schemasAsText.split(" "))
            .collect(Collectors.toMap(s -> s.charAt(0), SchemasParser::parser));
  }

  public Object getArgsValue(char l, String s) {
    return this.schemaMap.get(l).getValue(s);
  }
}
