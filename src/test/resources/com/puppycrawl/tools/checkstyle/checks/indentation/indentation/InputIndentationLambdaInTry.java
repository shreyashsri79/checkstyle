/* Config:                                                                              //indent:0 exp:0
 * This test-input is intended to be checked using following configuration:             //indent:1 exp:1
 *                                                                                      //indent:1 exp:1
 * arrayInitIndent = 4                                                                  //indent:1 exp:1
 * basicOffset = 4                                                                      //indent:1 exp:1
 * braceAdjustment = 0                                                                  //indent:1 exp:1
 * caseIndent = 4                                                                       //indent:1 exp:1
 * forceStrictCondition = false                                                         //indent:1 exp:1
 * lineWrappingIndentation = 1                                                          //indent:1 exp:1
 * tabWidth = 4                                                                         //indent:1 exp:1
 * throwsIndent = 4                                                                     //indent:1 exp:1
 *                                                                                      //indent:1 exp:1
 */                                                                                     //indent:1 exp:1

package com.puppycrawl.tools.checkstyle.checks.indentation.indentation;                 //indent:0 exp:0

import java.io.IOException;                                                             //indent:0 exp:0
import java.nio.file.Files;                                                             //indent:0 exp:0
import java.nio.file.Path;                                                              //indent:0 exp:0
import java.util.stream.Stream;                                                         //indent:0 exp:0

public class InputIndentationLambdaInTry {                                              //indent:0 exp:0

    Stream<Path> unparenthesizedParameterInTry(Path folder) {                           //indent:4 exp:4
        try {                                                                           //indent:8 exp:8
            return Files.find(folder, Integer.MAX_VALUE, (path, fileOpts) -> "pom.xml".equals(path.getFileName()))                         //indent:12 exp:12
                .map(pomXml -> folder.getParent().relativize(pomXml));                              //indent:16 exp:16
        } catch (final IOException ioException) {                                               //indent:8 exp:8
            return Stream.empty();                                                      //indent:12 exp:12
        }                                                                               //indent:8 exp:8
    }                                                                                   //indent:4 exp:4

    Stream<Path> parenthesizedParameterInTry(Path folder) {                             //indent:4 exp:4
        try {                                                                           //indent:8 exp:8
            return Files.find(folder, Integer.MAX_VALUE, (path, fileOpts) -> "pom.xml".equals(path.getFileName()))                         //indent:12 exp:12
                .map((pomXml) -> folder.getParent().relativize(pomXml));                            //indent:16 exp:16
        } catch (final IOException ioException) {                                               //indent:8 exp:8
            return Stream.empty();                                                      //indent:12 exp:12
        }                                                                               //indent:8 exp:8
    }                                                                                   //indent:4 exp:4

    Stream<Path> unparenthesizedParameterWithoutTry(Path folder) throws IOException {   //indent:4 exp:4
        return Files.find(folder, Integer.MAX_VALUE, (path, fileOpts) -> "pom.xml".equals(path.getFileName()))                             //indent:8 exp:8
            .map(pomXml -> folder.getParent().relativize(pomXml));                                  //indent:12 exp:12
    }                                                                                   //indent:4 exp:4
}                                                                                       //indent:0 exp:0
