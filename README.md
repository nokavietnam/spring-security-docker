# Getting Started

## Database

#### USER
- id: Long
- name: String
- username: String
- password: String
- roles: Collection<Role>

#### ROLE
- id: Long
- name: String

## Run Local
```bash
# run docker sql8 test local
docker-compose -f docker-compose-mysql.yaml up -d
```

## Docker
### Start Application
```bash
# start
docker-compose up
# or
docker-compose up -d
# check
docker ps
docker images

```

### Stop Application
```bash
# stop
docker-compose down

# stop and remove all container 
docker-compose down -rmi all
```