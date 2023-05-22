#!/bin/bash
mvn clean install -T4; clear; java -Dfile.encoding=UTF-8 -jar bootstrap/target/ESI-Launcher-Bootstrap.jar
