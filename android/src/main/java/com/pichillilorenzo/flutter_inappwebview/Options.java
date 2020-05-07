package com.pichillilorenzo.flutter_inappwebview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Options {

  static String LOG_TAG = "Options";

  public abstract void setValueForField(String field, Object value);

  public abstract Object getValueForField(String field);

  public abstract String[] getFieldList();

  public Options parse(HashMap<String, Object> options) {
    Iterator it = options.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, Object> pair = (Map.Entry<String, Object>) it.next();
      Object value = this.onParse(pair);
      setValueForField(pair.getKey(), value);
    }
    return this;
  }

  public Object onParse(Map.Entry<String, Object> pair) {
    return pair.getValue();
  }

  public HashMap<String, Object> getHashMap() {
    HashMap<String, Object> options = new HashMap<>();

    for (String field : getFieldList()) {
      options.put(field, getValueForField(field));
    }
//    for (Field field : this.getClass().getDeclaredFields()) {
//      options.put(field.getName(), onGetHashMap(field));
//    }
    return options;
  }

//  public Object onGetHashMap(Field field) {
//    try {
//      return field.get(this);
//    } catch (IllegalAccessException e) {
//      Log.d(LOG_TAG, e.getMessage());
//    }
//    return null;
//  }

}
