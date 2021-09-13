package com.github.jfleck1.neo4jexample.controllers;

import com.github.jfleck1.neo4jexample.config.MetadataConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * The MetadataController provides a RESTful interface for the application's metadata
 */
@RestController
@RequestMapping("/resources/metadata")
public class MetadataController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MetadataController.class);
    private final MetadataConfig config;

    @Autowired
    public MetadataController(MetadataConfig config) {
        this.config = config;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> get() {
        LOGGER.debug("In AboutController.get");
        Map<String, Object> result = new HashMap<>();

        result.put("name", config.getName());
        result.put("version", config.getVersion());
        result.put("group", config.getGroup());
        result.put("builtOn", config.getBuiltOn());

        return result;
    }
}
