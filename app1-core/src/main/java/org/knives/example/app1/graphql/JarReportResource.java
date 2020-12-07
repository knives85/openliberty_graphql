package org.knives.example.app1.graphql;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.knives.example.app1.graphql.dto.JarItemDto;

import javax.enterprise.context.RequestScoped;

@GraphQLApi
@RequestScoped
public class JarReportResource {

    @Query("jarItems")
    public JarItemDto findOneItem() {
        return new JarItemDto("jar1", "jarDesc1");
    }

}

