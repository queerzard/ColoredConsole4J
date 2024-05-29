# ColoredConsole

A System.out.println(); wrapper that allows you to output colored text.

## Maven Installation

```xml

<repositories>
	<repository>
		  <id>jitpack.io</id>
		  <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
	  <groupId>com.github.queerzard</groupId>
	  <artifactId>ColoredConsole4J</artifactId>
	  <version>-87250528a2-1</version>
</dependency>
```

## Used libraries

- [Jansi](https://github.com/fusesource/jansi)

## Color Reference

| Code |             Style             | Ansi Escape Code |
| :----: | :------------------------------: | :----------------: |
| §f0 |        Forground-Black        |        30        |
| §f1 |         Forground-Blue         |        34        |
| §f2 |        Forground-Green        |        32        |
| §f3 |         Forground-Cyan         |        36        |
| §f4 |         Forground-Red         |        31        |
| §f5 |       Forground-Magenta       |        35        |
| §f6 |        Forground-Yellow        |        33        |
| §f7 |        Forground-White        |        37        |
| §f8 | Forground-Bright Black (Gray) |        90        |
| §f9 |     Forground-Bright Blue     |        94        |
| §fa |     Forground-Bright Green     |        92        |
| §fb |     Forground-Bright Cyan     |        96        |
| §fc |      Forground-Bright Red      |        91        |
| §fd |    Forground-Bright Magenta    |        95        |
| §fe |    Forground-Bright Yellow    |        93        |
| §ff |     Forground-Bright White     |        97        |
|      |                                |                  |
| §b0 |        Background-Black        |        30        |
| §b1 |        Background-Blue        |        34        |
| §b2 |        Background-Green        |        32        |
| §b3 |        Background-Cyan        |        36        |
| §b4 |         Background-Red         |        31        |
| §b5 |       Background-Magenta       |        35        |
| §b6 |       Background-Yellow       |        33        |
| §b7 |        Background-White        |        37        |
| §b8 | Background-Bright Black (Gray) |        90        |
| §b9 |     Background-Bright Blue     |        94        |
| §ba |    Background-Bright Green    |        92        |
| §bb |     Background-Bright Cyan     |        96        |
| §bc |     Background-Bright Red     |        91        |
| §bd |   Background-Bright Magenta   |        95        |
| §be |    Background-Bright Yellow    |        93        |
| §bf |    Background-Bright White    |        97        |
|      |                                |                  |
| §eb |              Bold              |        1        |
| §eu |           Underline           |        4        |
|      |                                |                  |
| §r |             Reset             |        0        |

## Usage/Examples

To directly print the processed text

```java
ColoredConsole.print(String<text>,boolean colored,boolean date,boolean time);
```

Get the processed String only:

```java
ColoredConsole.getString(String<text>,boolean colored,boolean date,boolean time);
```
