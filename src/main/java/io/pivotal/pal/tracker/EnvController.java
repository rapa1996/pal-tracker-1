package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by RA371996 on 4/1/2018.
 */
@RestController
public class EnvController {
    private Map<String, String> envVariables = new HashMap<>();

    public EnvController(@Value("${PORT:NOT SET}") String PORT, @Value("${MEMORY_LIMIT:NOT SET}") String MEMORY_LIMIT, @Value("${CF_INSTANCE_INDEX:NOT SET}") String CF_INSTANCE_INDEX, @Value("${CF_INSTANCE_ADDR:NOT SET}") String CF_INSTANCE_ADDR){
        envVariables.put("PORT", PORT);
        envVariables.put("MEMORY_LIMIT", MEMORY_LIMIT);
        envVariables.put("CF_INSTANCE_INDEX", CF_INSTANCE_INDEX);
        envVariables.put("CF_INSTANCE_ADDR", CF_INSTANCE_ADDR);
    }

    @RequestMapping(value = "/env")
    public Map<String, String> getEnv(){
        return envVariables;
    }
}
