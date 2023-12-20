https://spring.io/guides/tutorials/rest/

learning purpose

There are multiple repository implementations besides JPA. You can use Spring Data MongoDB, Spring Data GemFire, Spring Data Cassandra, etc. For this tutorial, we’ll stick with JPA.

This decompressed output shows not only the data elements you saw earlier (id, name and role), but also a \_links entry containing two URIs. This entire document is formatted using HAL.

Wow! That method, which used to just be repository.findAll()

This simple interface has one method: toModel(). It is based on converting a non-model object (Employee) into a model-based object (EntityModel<Employee>).
