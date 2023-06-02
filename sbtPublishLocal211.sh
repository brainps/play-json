#!/bin/sh
# 2023Jun02 Brockman 

tag="2.8.211"
git tag -d $tag
git tag $tag
echo "Created temporary git tag $tag so the build.sbt dynamically publishes this version"

sbt ++2.11.12 publishLocal

git tag -d $tag
echo "Deleted git tag $tag"

