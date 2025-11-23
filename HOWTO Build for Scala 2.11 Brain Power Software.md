# HOWTO Build for Scala 2.11 Brain Power Software.md

## Changes
- 2025-11-23 Brockman - Documentation during new build environment provisioning

## Summary

Flatmap 3.0 requires scala 2.11, therefore all depedencies must be cross compiled back.

This library is a dependency of the idship-crypto-commons 2.11 modules, which flatmpa depends on.

Thankfully this is very easy, with a branch already ready to go and shell script that defines the special arguments.

Use the sbt.sh script, not sbt publishLocal.

There is a trick to use a temporary tag so sbt picks up a consistent build version: Deleted tag '2.8.211' (was 482b47c) is expected.

## Steps

```
git clone git@github.com:brainps/play-json.git

git checkout release_2.8.x

./sbtPublishLocal211.sh

```

[success] Total time: 75 s (01:15), completed Nov 23, 2025, 3:21:41 PM
Deleted tag '2.8.211' (was 482b47c)
Deleted git tag 2.8.211

# eof
