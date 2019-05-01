# repository-demo
A demo Spring boot app for showing how to annotate a repository and autowire it to a spring service.

Posted as part of this SO post: [How to fix “Field … required a bean of type … that could not be found” exception Spring Boot
][1]

Once started the application from your IDE you will see something like this printed in console:

```
************TopicRepository autowired************  
 ->com.sun.proxy.$Proxy66
 ```
That indicates the code in [`TopicService#showTopicRepositoryInfo`][2] is able to access an instance of `TopicRepository` autowired into
the variable [`topicRepository`][3].

[1]:https://stackoverflow.com/a/55933872/5640649
[2]: https://github.com/lealceldeiro/repository-demo/blob/master/src/main/java/com/example/demo/TopicService.java#L15
[3]: https://github.com/lealceldeiro/repository-demo/blob/master/src/main/java/com/example/demo/TopicService.java#L12
