package com.es.integration.demo

import com.es.integration.demo.repo.UserRepository
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.binding.DataBindingUtils

@Transactional
class UserService {

    UserRepository userRepository

    def save(User user) {

        com.es.integration.demo.entities.User elasticsearchUser = new com.es.integration.demo.entities.User()
        DataBindingUtils.bindObjectToInstance(elasticsearchUser , user)
        userRepository.save(elasticsearchUser)
        println(userRepository.findByFirstName(elasticsearchUser.firstName).properties)

    }
}
