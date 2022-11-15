package org.hprtech;

import java.net.URL;

public class TvSeries {
   int id;
   URL url;
   String name;
   String type;
   String language;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public URL getUrl() {
      return url;
   }

   public void setUrl(URL url) {
      this.url = url;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getLanguage() {
      return language;
   }

   public void setLanguage(String language) {
      this.language = language;
   }
}
