#!/bin/bash

# Clean previous build
rm -rf out/*

# Compile Java files
javac -d out src/neej/*.java

# Check if compilation succeeded
if [ $? -eq 0 ]; then
    echo "Build successful. Run ./run.sh to run the program."
else
    echo "Build failed."
    exit 1
fi
