# HOWTO Build for Scala 2.11 Brain Power Software.md

## Changes
- 2025-11-23 Brockman - Documentation during new build environment provisioning

## Summary

Flatmap 3.0 requires scala 2.11, therefore all depedencies must be cross compiled back.

Thankfully this is very easy, with a branch already ready to go and no special arguments.

## Steps

```
git clone git@github.com:brainps/play-json.git

git checkout release_2.8.x

sbt publishLocal 

```

[success] Total time: 55 s, completed Nov 23, 2025, 3:18:06 PM
brockman@data6albert-fe26-dc2:~/brainps/git/play-json_2.8.211$


