package com.es.integration.demo.repo

import com.es.integration.demo.entities.User
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface UserRepository extends ElasticsearchRepository<User, String> {

}