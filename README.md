# AdminFaces in Jakarta EE 9 Starter Project

This is a starter project that can be used to try AdminFaces, PrimeFaces and Jakarta EE 9 together or to bootstrap your own project using these technologies.

At the time it was written, I couldn't find a version of AdminFaces that had already migrated to Jakarta EE 9, so I [cloned the admin-template repository](https://github.com/vitorsouza/admin-template), [upgraded Java EE references to Jakarta EE 9 references](https://github.com/vitorsouza/admin-template/commit/840cdeaae78f4ee6042fdd52b7d4b7e3af63405c), ran `mvn deploy` to create the new artifact at a local [Maven](https://maven.apache.org/) repository then uploaded it to [LabES UFES' webserver](https://labes.inf.ufes.br/maven2/com/github/adminfaces/admin-template/1.3.1-jakarta/admin-template-1.3.1-jakarta.pom) in order for people to be able to declare it as a dependency in their Maven projects.

There's probably a better way of doing this and I'm open to suggestions. This is the quickest, although organized and usable, way I could think of making this available to students taking the Web Development course.

To test it, I used [WildFly](https://www.wildfly.org/downloads/) Preview EE 9.1 Distribution. The home page should be an instance of [Admin Template](https://github.com/adminfaces/admin-template) and PrimeFaces buttons should allow the user to try some AJAX funcionality to see if it all works.
