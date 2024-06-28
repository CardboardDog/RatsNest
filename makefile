SOURCE := src
OUT := dist
BUILD := build
RESOURCES := res
all:
	mkdir -p $(BUILD)
	mkdir -p $(OUT)
	javac $(SOURCE)/*.java -d $(BUILD)
	cp -r $(RESOURCES) $(BUILD)/
	cp manifest.mf $(BUILD)/manifest.mf
	cd $(BUILD);jar cfm ../$(OUT)/RatsNest.jar manifest.mf .
debug:
	make all
	java -jar $(OUT)/RatsNest.jar