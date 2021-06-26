# dms-xtender
Small piece of Depot Management System.

## Instal
- Create folder smartdepot at `C:\smartdepot`
- Download latest release of extender and extract at `C:\smartdepot` it will add folder named `target`
- open folder `target` and create a file `extender.bat` with content : 

```
@ECHO OFF
D:\Install\Java\jdk-16.0.1\bin\java.exe -Ddata=%1 -jar C:\smartdepot\target\DMS-Xtender-1.0.jar
```
Replace java.exe path with your own java.exe path

- create keys in regedit `smartdepot -> shell -> open -> command`
- in key `smartdepot` create new string Value `URL protocol` without value
- in key `command` add value `"C:\smartdepot\target\extender.bat" "%1"` to default name 
