# Azure sql edge

## start docker

 ```bash
sudo docker run --cap-add SYS_PTRACE -e 'ACCEPT_EULA=1' -e 'MSSQL_SA_PASSWORD=YourStrong@Passw0rd' -e 'MSSQL_PID=Premium' -p 1433:1433 --name azuresqledge -d mcr.microsoft.com/azure-sql-edge

sudo docker exec -it azuresqledge "bash"

/opt/mssql-tools/bin/sqlcmd -S localhost -U SA
 ```

## Azure SQL Data Studio

- 127.0.0.1 : Advance>Port:1433

 ```sql
CREATE DATABASE tempdb;
GO


SELECT name from sys.databases;
GO

USE tempdb;


select * from person;

```

## note:
