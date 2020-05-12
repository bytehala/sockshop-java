# Components

The instructions for running the base project using docker-compose are here: https://microservices-demo.github.io/deployment/docker-compose.html

Based on the docker-compose.yml file, the components (aka services) are:

  - front-end
    - the frontend application for all microservices
    - image: weaveworksdemos/front-end:0.3.12
  - edge-router
    - image: weaveworksdemos/edge-router:0.1.1
  - catalogue
    - serves the API for the items in the shop
    - image: weaveworksdemos/catalogue:0.3.5
  - catalogue-db
    - contains data served by catalogue
    - image: weaveworksdemos/catalogue-db:0.3.0
  - carts:
    - image: weaveworksdemos/carts:0.4.8
  - carts-db:
    - image: mongo:3.4
  - orders:
    - image: weaveworksdemos/orders:0.4.7
  - orders-db:
    - image: mongo:3.4
  - shipping:
    - image: weaveworksdemos/shipping:0.4.8
  - queue-master:
    - image: weaveworksdemos/queue-master:0.3.1
  - rabbitmq:
    - image: rabbitmq:3.6.8
  - payment:
    - image: weaveworksdemos/payment:0.4.3
  - user:
    - image: weaveworksdemos/user:0.4.4
  - user-db:
    - image: weaveworksdemos/user-db:0.4.0
  - user-sim:
    - image: weaveworksdemos/load-test:0.1.1

### Step 1 - Catalogue + catalogue-db
I have decided that I'll work on creating a Spring Boot version of catalogue first.

So we have a catalogue directory with its own docker-compose.yml. It only contains the catalogue-db configuration, and that is the data we will be using to build the catalogue service on.

The connection details to catalogue-db are:
catalogue_user:default_password@tcp(catalogue-db:3306)

```
username: catalogue_user
password: default_password
"catalogue-db" I think is what docker uses in place of the actual IP address
```