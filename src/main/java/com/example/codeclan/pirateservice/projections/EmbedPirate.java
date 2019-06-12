package com.example.codeclan.pirateservice.projections;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

    @Projection(name = "embedPirate", types = Ship.class)
    public interface EmbedPirate {
        String getName();

        List<Pirate> getPirates();
    }

