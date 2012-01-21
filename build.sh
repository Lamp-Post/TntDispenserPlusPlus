#!/bin/bash

mvn package 2>&1 | grep -v ^\*DEBUG
