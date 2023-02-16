package com.vincent.demo.springbootelk.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.Jsr310Converters.LocalDateTimeToDateConverter;
import org.springframework.data.elasticsearch.config.ElasticsearchConfigurationSupport;
import org.springframework.data.elasticsearch.core.convert.ElasticsearchCustomConversions;

@Configuration
public class ElasticsearchConfig extends ElasticsearchConfigurationSupport {

  @Override
  public ElasticsearchCustomConversions elasticsearchCustomConversions() {
    List<Converter> converters = new ArrayList<>();
    converters.add(LocalDateTimeToDateConverter.INSTANCE);
    return new ElasticsearchCustomConversions(converters);
  }
}
