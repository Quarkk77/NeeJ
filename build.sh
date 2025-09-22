#!/bin/bash
set -e

# compile into ./out
mkdir -p out
javac -d out $(find src -name "*.java")

# run main
java -cp out neeJ.App

