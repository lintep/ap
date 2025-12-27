package ap.bookcodes.ch22.sec06;

import javax.swing.*;
import java.awt.*;

public class SelectionSortViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 400;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SelectionSortComponent component 
            = new SelectionSortComponent();
      frame.add(component, BorderLayout.CENTER);

      frame.setVisible(true);
      component.startAnimation();
   }
}

