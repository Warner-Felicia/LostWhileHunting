/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

/**
 *
 * @author Group
 */
public class LocationsControl {

    public static int loadSimpleSceneIfNotMajorMapCoord(int column, int row) {

        if (column == row) {
            if (column == 0 || column == 3 || column == 5 || column == 7) {
                loadMajorSceneIfMapCoordTrue(column, row);
            } else {
                QuestionsAndSceneControl.checkSceneQuestionChoiceAndReturnNewScene();
            }
        } else {
            QuestionsAndSceneControl.checkSceneQuestionChoiceAndReturnNewScene();
        }
        return 0;

    }

    private static void loadMajorSceneIfMapCoordTrue(int column, int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
