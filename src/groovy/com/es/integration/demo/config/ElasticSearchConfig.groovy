package com.es.integration.demo.config


import grails.util.Holders
import groovy.util.logging.Log4j
import org.elasticsearch.client.Client
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.ImmutableSettings
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.common.transport.InetSocketTransportAddress
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Log4j
@Configuration
@EnableElasticsearchRepositories(basePackages = ["com.es.integration.demo.repo"])
class ElasticSearchConfig {

    @Bean
    ElasticsearchOperations elasticsearchTemplate() {
        Client client
        Settings settings

        log.debug("~~~~~~~~~~~~~~~ Elastic Search Configuration ~~~~~~~~~~~~~~~~~~~~~~")
        log.debug("${Holders.config.grails.elasticsearch.properties}")
        println "*********************************************************************"


        InetSocketTransportAddress inetSocketTransportAddress = new InetSocketTransportAddress(
                "localhost",
                9300
        )

        settings = ImmutableSettings.settingsBuilder()
                .put("cluster.name", "fibonacciWarrior")
                .build()
        client = new TransportClient(settings)
                .addTransportAddress(inetSocketTransportAddress)


        return new ElasticsearchTemplate(client)
    }
}
