# https://stackoverflow.com/a/18258352
rwildcard=$(foreach d,$(wildcard $(1:=/*)),$(call rwildcard,$d,$2) $(filter $(subst *,%,$2),$d))

BIN_NAME = bibliotheque
BIN_JAR = $(BIN_NAME).jar

SRC_DIR = src
SOURCES = $(call rwildcard,$(SRC_DIR),*.kt)

$(BIN_JAR): $(SOURCES)
	kotlinc $(SOURCES) -include-runtime -d $(BIN_JAR)

.PHONY: run
run: $(BIN_JAR)
	java -jar $(BIN_JAR)

.PHONY: clean
clean:
	rm -f $(BIN_JAR)

.PHONY: re
re: clean $(BIN_JAR)
