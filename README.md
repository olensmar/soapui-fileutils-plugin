## soapui-fileutils-plugin

- Adds  file-related utilities to SoapUI

### Usage

The plugin is available at [sourceforge](https://sourceforge.net/projects/soapui-plugins/files/soapui-fileutils-plugin/) -
download and unzip into the SoapUI/bin folder, this will place files in the underlying folders as follows
(be sure to remove any previous versions of these files):

```
/soapui
   /bin
      /plugins
         soapui-fileutils-plugin-0.1-plugin.jar
```

### Features


#### Save Response
Adds a "Save Response" menu option to the HTTP, REST and SOAP TestSteps - prompting you to save the last received response to a file.
Can come in handy if you need to save binary responses (images, pdf:s, etc).

### Build it yourself

Clone the Git repository, make sure you have maven installed, and run

```
mvn clean install assembly:single
```

to get the same zip as found on [sourceforge](https://sourceforge.net/projects/soapui-plugins/files/soapui-fileutils-plugin/)

- Version 0.1 - 2014-01-09 - Initial version

### Feedback is welcome!

Please don't hesitate to comment here or get in touch on twitter; @olensmar

Thanks!

/Ole