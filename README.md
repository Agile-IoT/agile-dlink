# agile-dlink-protocol
A DLink DCH S150 java protocol implementation for AGILE gateway.

This component integrates a sensor protocol  for DLINK™ Wi-Fi motion sensors (http://us.dlink.com/products/connected-home/wi-fi-motion-sensor/) into the AGILE  gateway, that will allow the platform to connect this new devices, collect their data and send it to enControl backend. 

This work is related with https://github.com/Agile-IoT/agile-dlink-notifier.

Following AGILE architecture, it is developed as a docker container implementing DLINK™ protocol communication and a DLINK™ device file which handles the AGILE device interface.

DLINK™ protocol component handles:

    •	Devices discovery
    •	Devices registration  
    •	Devices communication
    •	Data push to enControl

DLINK™ device file handles:

    •	Devices connectivity status
    •	Devices connection / disconnection to AGILE
    •	Data request to the protocol component

DLINK™ protocol is simple and straightforward, the devices implement an HNAP interface which can be consumed using network SOAP messages, that API is protected by a PIN code specific for every device. 

As a side note and due to the current limitations of the AGILE gateway, we have hardcoded the device IP address and the PIN code as UI/framework did not provide any means to allow the user to introduce any of those parameters manually (the PIN code cannot be auto discovered for obvious reasons).

After a device is discovered and registered, the protocol component will periodically poll the device to get the latest detection date, when the date changes a DETECTION event is generated and reported to enControl, after 5 seconds the state is changed back to OK status which is also reported to the cloud. This status is also stored in memory, so when AGILE platform requires a read from a registered device, the protocol returns device’s status.

Pre-requisites:
---------------
  1.	Choose an AGILE installation method http://agile-iot.eu/resources/agile-wiki/ 
  2.	Clone agile-dev repo (https://github.com/Agile-IoT/agile-dev) to your working machine and follow the step defined on the README of agile-stack repository (https://github.com/Agile-IoT/agile-stack) to configure your development environment
  3.	Test that your development environment is working (try to build and deploy it, agile-stack includes an agile-dummy protocol that you can modify for your tests)


Steps to use it in your AGILE project:
--------------------------------------

  1.	Clone agile-dlink github repository (https://github.com/Agile-IoT/agile-dlink)
  
  2.	Modify agile-dlink configuration parameters:
  
    a.	DLink device IP (found in file DLinkProtocol.java and DLinkMotionSensorHandler.java)
    b.	DLink device PIN (found in file DLinkMotionSensorHandler.java)
    c.	enControl API key (found in file SStackWebApiConsumer.java)   
    d.	enControl username (found in file SStackWebApiConsumer.java)    
    e.	enControl password (found in file SStackWebApiConsumer.java)    
    f.	enControl installation Id (found in file DLinkMotionSensorHandler.java)   
    g.	enControl sensor Id (found in file DLinkMotionSensorHandler.java)
  
  3.	Compile DLinkDevice.java and copy the resulting .class file to your deployment target’s device files folder (follow the complete and detailed AGILE’s official documentation that can be found following the link http://agile-iot.eu/wiki/index.php?title=Dev_Device) 

  4.	Modify agile-stack Docker/Docker Compose files as needed for your development environment and your deployment target chosen in the pre-requisites (you can take agile-dummy as an example or follow the complete and detailed AGILE’s official documentation in the following link http://agile-iot.eu/wiki/index.php?title=How_to_develop_a_new_Protocol) 
  
  5.	Launch a Docker build (for the specific command check the complete and detailed AGILE’s official documentation in the following link http://agile-iot.eu/wiki/index.php?title=How_to_develop_a_new_Protocol or check docker documentation https://docs.docker.com/) 
  
  6.	Launch a Docker deploy (for the specific command check the complete and detailed AGILE’s official documentation in the following link http://agile-iot.eu/wiki/index.php?title=How_to_develop_a_new_Protocol or check docker documentation https://docs.docker.com/)

  7.	Now you will be able to register your DLink sensor and see the data on enControl platform. You can see the logs printing agile-dlink docker container logs (for the specific command check docker documentation https://docs.docker.com/)
