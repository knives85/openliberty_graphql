package org.knives.example.app1.graphql;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.knives.example.app1.graphql.dto.WarItemDto;

import javax.enterprise.context.RequestScoped;

@GraphQLApi
@RequestScoped
public class WarReportResource {

    @Query("warItems")
    public WarItemDto findOneWarItem() {
        return new WarItemDto("war1", "warDesc1");
    }

}

