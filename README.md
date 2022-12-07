# WS2022_SLM_Proj

This repo stores the assignment done by

ic21b045,
ic21b066 (anemac1),
ic20b044

Sample project in SLM course, featuring a REST-Server based on SpringBoot Framework to set and read messages concerning maintenance ("Maintenance monitor")

## How to run program

Start server by typing "java -jar filename.jar" in the command prompt started out of the folder

Open browser and use following URL to see current message: http://localhost:8080/api/message

Use following URL to set message: http://localhost:8080/api/message/set?m=XXX

Use following URL to reset message ("OK"): http://localhost:8080/api/message/reset
