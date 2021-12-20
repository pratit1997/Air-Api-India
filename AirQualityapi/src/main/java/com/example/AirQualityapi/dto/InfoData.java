package com.example.AirQualityapi.dto;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class InfoData {
   String index_name,title,desc,org_type,source,catalog_uuid;
   List<String>org,sector;
   int visualizable,active,created,updated,external_ws;
   String created_date,updated_date;
  StateData[] records;

}
