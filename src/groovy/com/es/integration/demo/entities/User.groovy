package com.es.integration.demo.entities
import org.springframework.data.elasticsearch.annotations.*
import org.springframework.data.annotation.Id

@Document(indexName = "user", type = "user")
class User {

    @Id
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    Long id

    @Field(type = FieldType.String, index = FieldIndex.analyzed)
    String firstName

    @Field(type = FieldType.String, index = FieldIndex.analyzed)
    String lastName

    @Field(type = FieldType.String, index = FieldIndex.analyzed)
    String emailId

}
