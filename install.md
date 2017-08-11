JBoss Fuse
—————
fabric:create --clean --wait-for-provisioning  --new-user admin --new-user-password admin --new-user-role admin --resolver manualip --manual-ip 127.0.0.1
container-remove-profile root jboss-fuse-full

profile-create --parent jboss-fuse-full demo-soap
profile-edit --bundle mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3 demo-soap
profile-edit --bundle mvn:org.postgresql/postgresql/9.4.1212 demo-soap
profile-edit --features camel-sql demo-soap
profile-edit --bundle mvn:org.jboss.fis2.demo/demo-soap/1.0.0-SNAPSHOT demo-soap

profile-create --parent jboss-fuse-full demo-rest
profile-edit --repositories mvn:org.apache.camel/camel-jbossdatagrid/6.6.0.Final-redhat-4/xml/features demo-rest
profile-edit --features camel-jbossdatagrid demo-rest
profile-edit --features activemq-camel demo-rest
profile-edit --bundle mvn:org.jboss.fis2.demo/demo-rest/1.0.0-SNAPSHOT demo-rest

profile-create --parent jboss-fuse-full demo-amq
profile-edit --features activemq-camel demo-amq
profile-edit --bundle mvn:org.jboss.fis2.demo/demo-amq/1.0.0-SNAPSHOT demo-amq

container-create-child root child-01

container-add-profile child-01 demo-soap
container-add-profile child-01 demo-rest
container-add-profile child-01 demo-amq
 
