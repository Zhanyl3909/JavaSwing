import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;

class Frame extends JFrame {

    public Frame() {
        setTitle("HomeWork");
        setSize(600,800);
//
//        ImageIcon background = new ImageIcon("C:\\Users\\장을아이\\Desktop\\JAVA\\homework\\src\n");
//        JLabel backLabel = new JLabel(background);




        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });




        Container contentPane = getContentPane();
        contentPane.add(new Panel());
        //  contentPane.setLayout(null);

    }
}

class Panel extends JPanel {
    private Font f1;
    private Font f2;
    private Font f3;
    private FontMetrics fm1;
    private FontMetrics fm2;
    private FontMetrics fm3;

    Image image = null;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        java.net.URL iURL = this.getClass().getResource("mazingBackground.jpeg");
        image = new javax.swing.ImageIcon(iURL).getImage();

        g.drawImage(image, 0, 0, this);

        QuadCurve2D curve;
        Graphics2D g2d = (Graphics2D) g;

        GeneralPath path;

        String s1 = "20212717   ";
        String s2 = "3학년   ";
        String s3 = " 장을아이입니다";





        f1 = new Font("SansSerif", Font.BOLD, 16);
        f2 = new Font("SansSerif", Font.BOLD, 16);
        f3 = new Font("SansSerif", Font.BOLD, 16);
        fm1 = g.getFontMetrics(f1);
        fm2 = g.getFontMetrics(f2);
        fm3 = g.getFontMetrics(f3);

        int w1 = fm1.stringWidth(s1);    //font객체의 fontmetrics객체를 이용해서 string의 width구하기
        int w2 = fm2.stringWidth(s2);
        int w3 = fm3.stringWidth(s3);

        Dimension d = getSize();
        int cx = 21;
        int cy = (44 -fm1.getHeight())/2 + fm1.getAscent();

        g.setFont(f1);
        g.drawString(s1, cx, cy);

        cx += w1;
        cy += fm3.getAscent();


        g.setFont(f2);
        g.drawString(s2, cx, cy);


        cx += w2;
        cy += fm3.getAscent();


        g.setFont(f3);
        g.drawString(s3, cx, cy);




        //STOMACH GREY

        int[] x_stom = {208, 287, 371, 365, 211, 196, 377, 416, 347, 314, 264, 261, 221, 160, 176, 197};
        int[] y_stom = {469, 470, 478, 515, 512, 534, 532, 612, 642, 571, 569, 579, 651, 628, 578, 534};



        g.setColor(new Color(225, 230, 234));
        g.fillPolygon(x_stom, y_stom, x_stom.length);
        g.drawPolygon(x_stom, y_stom, x_stom.length);

        g.setColor(Color.black);
        g.drawPolygon(x_stom, y_stom, x_stom.length);


        //PENTS
        int[] x_p = {370, 361, 294, 214, 208, 196, 194, 198, 229, 240, 264, 312, 321, 333, 366, 379, 381, 377, 370};
        int[] y_p = {494, 501, 511, 506, 496, 500, 518, 535, 551, 558, 586, 586, 575, 560, 540, 532, 508, 502, 493};


        g.setColor(new Color(31, 36, 40));
        g.fillPolygon(x_p, y_p, x_p.length);
        g.drawPolygon(x_p, y_p, x_p.length);

        g.setColor(Color.black);
        g.drawPolygon(x_p, y_p, x_p.length);






        //LEGS

        int[] x_lleg = {217, 240, 247, 255, 259, 264, 264, 263, 260, 258, 251, 244, 238, 242, 242, 237, 230, 221, 202, 176, 146, 131, 126, 120, 116, 117, 125, 140, 135, 133, 135, 146,
                154, 165, 181, 177, 188, 213, 216, 219};
        int[] y_lleg = {617, 616, 609, 600, 591, 602, 611, 625, 637, 647, 672, 681, 687, 692, 701, 707, 716, 724, 736, 741, 739, 735, 725, 717, 710, 702, 688, 666, 652, 644, 634, 615,
                589, 572, 565, 578, 590, 604, 621, 627};



        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_lleg, y_lleg, x_lleg.length);
        g.drawPolygon(x_lleg, y_lleg, x_lleg.length);

        g.setColor(Color.black);
        g.drawPolygon(x_lleg, y_lleg, x_lleg.length);




        //Right Leg
        int[] x_rleg = {361, 360, 402, 396, 417, 436, 448, 449, 442, 457, 471, 456, 431, 392, 363, 350, 345, 348, 335, 319, 319, 323, 330, 341, 356, 359};
        int[] y_rleg = {629, 606, 573, 565, 574, 603, 630, 640, 658, 678, 703, 731, 740, 741, 726, 713, 700, 690, 671, 629, 613, 597, 612, 620, 622, 626};




        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_rleg, y_rleg, x_rleg.length);
        g.drawPolygon(x_rleg, y_rleg, x_rleg.length);

        g.setColor(Color.black);
        g.drawPolygon(x_rleg, y_rleg, x_rleg.length);





        //ARMS_GREY
        //Left side
        int[] x_larm = {156, 148, 122, 73, 92, 111, 156};
        int[] y_larm = {432, 455, 494, 474, 436, 406, 432};


        g.setColor(new Color(225, 230, 234));
        g.fillPolygon(x_larm, y_larm, x_larm.length);
        g.drawPolygon(x_larm, y_larm, x_larm.length);

        g.setColor(Color.black);
        g.drawPolygon(x_larm, y_larm, x_larm.length);


        //Right side arm
        int[] x_rarm = {466, 480, 495, 442, 431, 419, 466};
        int[] y_rarm = {407, 432, 473, 492, 468, 432, 407};


        g.setColor(new Color(225, 230, 234));
        g.fillPolygon(x_rarm, y_rarm, x_rarm.length);
        g.drawPolygon(x_rarm, y_rarm, x_rarm.length);

        g.setColor(Color.black);
        g.drawPolygon(x_rarm, y_rarm, x_rarm.length);





        //BLUE ARMS
        //Left side arm

        int[] x_barm = {93, 88, 134, 147, 148, 133, 125, 110, 111, 116, 110, 103, 95, 82, 69, 60, 54, 48, 51, 40, 41, 55, 84, 88, 93};
        int[] y_barm = {429, 451, 475, 478, 489, 532, 543, 541, 555, 581, 588, 587, 590, 593, 589, 579, 561, 523, 518, 506, 500, 473, 429, 426, 429};



        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_barm, y_barm, x_barm.length);
        g.drawPolygon(x_barm, y_barm, x_barm.length);

        g.setColor(Color.black);
        g.drawPolygon(x_barm, y_barm, x_barm.length);




        //Right side arm

        int[] x_barm1 = {482, 491, 502, 526, 531, 522, 521, 519, 510, 505, 484, 472, 462, 457, 445, 449, 452, 458, 447, 439, 430, 423, 423, 425, 432, 446, 446, 484, 485, 482};
        int[] y_barm1 = {431, 427, 439, 490, 507, 518, 523, 541, 569, 584, 597, 595, 591, 591, 583, 575, 562, 545, 543, 536, 518, 494, 484, 472, 471, 471, 467, 461, 439,431};



        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_barm1, y_barm1, x_barm1.length);
        g.drawPolygon(x_barm1, y_barm1, x_barm1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_barm1, y_barm1, x_barm1.length);




        //CHEST
        int[] x_chest = {207, 225, 267, 305, 338, 362, 372, 388, 399, 405,
                407, 413, 421, 435, 468, 478, 480, 475, 468, 453,
                437, 435, 404, 369, 364, 183, 151, 131, 117, 107,
                100, 99, 101, 122, 139, 151, 163, 171, 174, 177,
                187, 207};

        int[] y_chest = {492, 484, 476, 478, 479, 485, 489, 483, 471, 457,
                445, 445, 448, 443, 425, 415, 396, 379, 370, 359,
                354, 355, 359, 353, 353, 358, 356, 359, 362, 371,
                386, 397, 416, 430, 440, 446, 443, 439, 439, 465,
                477, 492};



        g.setColor(new Color(31, 36, 40));
        g.fillPolygon(x_chest, y_chest, x_chest.length);
        g.drawPolygon(x_chest, y_chest, x_chest.length);

        g.setColor(Color.black);
        g.drawPolygon(x_chest, y_chest, x_chest.length);




        //V CHEST
        //Left Side chest V
        int[] x_vleft = {130, 211, 225, 257, 264, 193, 180, 130};
        int[] y_vleft = {332, 356, 394, 406, 463, 437, 383, 332};

        g.setColor(new Color(179, 8, 4));
        g.fillPolygon(x_vleft, y_vleft, x_vleft.length);;

        g.setColor(Color.black);
        g.drawPolygon(x_vleft, y_vleft, x_vleft.length);


        //Right Side chest V
        int[] x_vr = {453, 397, 382, 312, 320, 357, 374, 453};
        int[] y_vr = {338, 387, 441, 467, 408, 396, 359, 338};

        g.setColor(new Color(179, 8, 4));
        g.fillPolygon(x_vr, y_vr, x_vr.length);;

        g.setColor(Color.black);
        g.drawPolygon(x_vr, y_vr, x_vr.length);


        //RED V Shades
        int[] x_vsh = {321, 320, 320, 325, 327, 327, 331, 345, 358, 367, 371, 375, 381, 451, 402, 397, 389, 386, 385, 375, 354, 328, 321};
        int[] y_vsh = {462, 461, 456, 420, 409, 407, 403, 400, 397, 375, 368, 360, 357, 339, 382, 385, 418, 429, 437, 442, 450, 460, 462};

        g.setColor(new Color(192, 65, 48));
        g.fillPolygon(x_vsh, y_vsh, x_vsh.length);


        int[] x_vsh2 = {259, 254, 250, 235, 223, 217, 212, 206, 193, 168, 132, 131, 138, 155, 175, 180, 184, 187, 190, 193, 208, 221, 236, 251, 259};
        int[] y_vsh2 = {461, 419, 405, 401, 398, 396, 376, 359, 351, 344, 333, 332, 341, 358, 378, 381, 396, 414, 422, 435, 443, 448, 454, 458, 461};

        g.setColor(new Color(192, 65, 48));
        g.fillPolygon(x_vsh2, y_vsh2, x_vsh2.length);
//        g.setColor(new Color(227, 124, 107));
//        g.drawPolygon(x_vsh2, y_vsh2, x_vsh2.length);




        //HEAD BLACK SHADES
        int[] x_headSH = {361, 363, 381, 399, 392, 361};
        int[] y_headSh = {134, 128, 131, 134, 147, 134};

        g.setColor(Color.lightGray);
        g.fillPolygon(x_headSH,y_headSh,x_headSH.length);






        //HEAD_BLACK
        //Right side
        int[] x_hblack = {336, 346, 359, 376, 392, 408, 391, 381, 342, 336};
        int[] y_hblack = {182, 157, 129, 133, 133, 135, 176, 216, 224, 182};

        g.setColor(Color.black);
        g.fillPolygon(x_hblack, y_hblack, x_hblack.length);

        g.setColor(Color.darkGray);
        g.drawPolygon(x_hblack, y_hblack, x_hblack.length);


        //Left Side
        int[] x_hblack1 = {240, 231, 220, 195, 168, 184, 194, 240};
        int[] y_hblack1 = {186, 156, 129, 130, 133, 190, 228, 186};

        g.setColor(Color.black);
        g.fillPolygon(x_hblack1, y_hblack1, x_hblack1.length);

        g.setColor(Color.darkGray);
        g.drawPolygon(x_hblack1, y_hblack1, x_hblack1.length);









        //HEAD_RED_Part
        int[] x_rhead = {280, 295, 299, 310, 321, 335, 341, 346, 357, 370, 384, 386, 382, 360, 334, 290, 246, 223, 204, 201, 194, 194, 195, 209, 222, 232, 239, 245, 252, 259, 268, 278, 280};
        int[] y_rhead = {68, 67, 156, 159, 165, 175, 185, 186, 183, 182, 183, 226, 261, 293, 307, 314, 314, 313, 305, 256, 230, 209, 184, 184, 187, 189, 181, 174, 169, 164, 159, 157, 68};




        g.setColor(new Color(179, 8, 4));
        g.fillPolygon(x_rhead, y_rhead, x_rhead.length);

        g.setColor(Color.black);
        g.drawPolygon(x_rhead, y_rhead, x_rhead.length);








        //HEAD_BLUE
        int[] x_head = {227, 229, 237, 247, 263, 288, 313, 329, 342, 348, 352, 350, 343, 335, 311, 288, 251, 227, 227};
        int[] y_head = {219, 205, 189, 179, 168, 161, 165, 176, 187, 197, 205, 218, 229, 236, 243, 244, 242, 226, 219};

        g.setColor(new Color(3, 99, 160));
        g.fillPolygon(x_head, y_head, x_head.length);

        g.setColor(Color.black);
        g.drawPolygon(x_head, y_head, x_head.length);




        //Mustache
        //Left_Side Mustache
        int[] x_mst = {201, 194, 213, 201};
        int[] y_mst = {317, 340, 341, 317};


        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_mst, y_mst, x_mst.length);

        g.setColor(Color.black);
        g.drawPolygon(x_mst, y_mst, x_mst.length);



        //Right_Side Mustache
        int[] x_mst1 = {369, 385, 359, 369};
        int[] y_mst1 = {312, 338, 343, 312};


        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_mst1, y_mst1, x_mst1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_mst1, y_mst1, x_mst1.length);






        //GREY_EARS__CORONA
        //Left side
        int[] x_greyE = {217, 208, 188, 191, 196, 217};
        int[] y_greyE = {221, 161, 156, 185, 218, 221};

        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_greyE, y_greyE, x_greyE.length);

        g.setColor(Color.black);
        g.drawPolygon(x_greyE, y_greyE, x_greyE.length);


        //Right side
        int[] x_greyE1 = {364, 368, 373, 391, 389, 391, 364};
        int[] y_greyE1 = {220, 185, 156, 152, 176, 209, 220};

        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_greyE1, y_greyE1, x_greyE1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_greyE1, y_greyE1, x_greyE1.length);



        //Shades of grey ears corona
        int[] x_shsh = {373, 390, 390, 373};
        int[] y_shsh = {168, 161, 152, 158};

        g.setColor(Color.lightGray);
        g.fillPolygon(x_shsh, y_shsh, x_shsh.length);

        int[] x_shsh1 = {364, 374, 389, 378};
        int[] y_shsh1 = {217, 198, 181, 207};

        g.setColor(new Color(114, 118, 127));
        g.fillPolygon(x_shsh1, y_shsh1, x_shsh1.length);







        //Golden Horns
        //Left_Golden horns
        int[] x_horns = {183, 156, 129, 156, 184, 183};
        int[] y_horns = {273, 280, 286, 294, 303, 273};

        g.setColor(new Color(228, 179, 77));
        g.fillPolygon(x_horns, y_horns, x_horns.length);

        g.setColor(Color.black);
        g.drawPolygon(x_horns, y_horns, x_horns.length);


        //Right Side of HORNS
        //Left_Golden horns
        int[] x_horns1 = {391, 417, 448, 418, 392, 391};
        int[] y_horns1 = {274, 279, 286, 296, 300, 274};

        g.setColor(new Color(228, 179, 77));
        g.fillPolygon(x_horns1, y_horns1, x_horns1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_horns1, y_horns1, x_horns1.length);



        //YELLOW HORNS SHADE
        //right side
        int[] x_horsh = {395, 437, 395};
        int[] y_horsh = {287, 289, 301};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_horsh, y_horsh, x_horsh.length);


        //Left side
        int[] x_horsh1 = {183, 131, 183};
        int[] y_horsh1 = {290, 287, 283};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_horsh1, y_horsh1, x_horsh1.length);








        //Ears
        //Left_Side of EARS
        int[] x_ears = {183, 195, 211, 214, 214, 197, 183, 183};
        int[] y_ears = {273, 266, 266, 298, 317, 309, 305, 273};

        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_ears, y_ears, x_ears.length);

        g.setColor(Color.black);
        g.drawPolygon(x_ears, y_ears, x_ears.length);




        //Right side of ears
        int[] x_ears1 = {371, 392, 393, 382, 368, 363, 365, 371};
        int[] y_ears1 = {270, 273, 302, 308, 318, 302, 285, 270};

        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_ears1, y_ears1, x_ears1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_ears1, y_ears1, x_ears1.length);



        //EARS GREY SHADE
        int[] x_earSH = {392, 396, 396, 392};
        int[] y_earSH = {272, 272, 304, 304};

        g.setColor(Color.darkGray);
        g.fillPolygon(x_earSH, y_earSH, x_earSH.length);
        g.setColor(Color.darkGray);
        g.drawPolygon(x_earSH, y_earSH, x_earSH.length);


        int[] x_earSH1 = {181, 186, 186, 181};
        int[] y_earSH1 = {273, 271, 305, 301};

        g.setColor(Color.darkGray);
        g.fillPolygon(x_earSH1, y_earSH1, x_earSH1.length);
        g.setColor(Color.darkGray);
        g.drawPolygon(x_earSH1, y_earSH1, x_earSH1.length);





        //FACE_BLUE
        int[] x_face1 = {220, 231, 321, 375, 375, 371, 338, 306, 303, 301, 281, 278, 250, 224, 193, 201, 218, 220};
        int[] y_face1 = {330, 340, 370, 307, 275, 260, 279, 310, 300, 300, 300, 311, 289, 269, 263, 294, 330, 330};

        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_face1,y_face1,x_face1.length);
        g.drawPolygon(x_face1,y_face1,x_face1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_face1, y_face1, x_face1.length);








        //FACE_GREY
        int[] x_face = {260, 322, 371, 378, 331, 250, 199, 204, 260};
        int[] y_face = {398, 396, 341, 295, 332, 330, 294, 333, 398};


        g.setColor(new Color(199, 209, 219));
        g.fillPolygon(x_face, y_face, x_face.length);

        g.setColor(new Color(155, 155, 163));
        g.drawPolygon(x_face, y_face, x_face.length);




        //GREY SHADES
        int[] x_sh = {199, 253, 324, 320, 261, 202, 199};
        int[] y_sh = {298, 343, 346, 396, 397, 334, 298};

        g.setColor(Color.lightGray);
        g.fillPolygon(x_sh, y_sh, x_sh.length);

//        g.setColor(Color.gray);
//        g.drawPolygon(x_sh, y_sh, x_sh.length);


        int[] x_sh0 = {329, 379, 370, 325, 329};
        int[] y_sh0 = {343, 296, 340, 393, 343};

        g.setColor(Color.lightGray);
        g.fillPolygon(x_sh0, y_sh0, x_sh0.length);

//        g.setColor(Color.gray);
//        g.drawPolygon(x_sh0, y_sh0, x_sh0.length);






        //FACE_GREY_SQUARES
        int[] x_1 = {266, 275, 275, 266};
        int[] y_1 = {352, 352, 390, 390};

        g.setColor(Color.black);
        g.fillPolygon(x_1, y_1, x_1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_1, y_1, x_1.length);



        int[] x_2 = {286, 295, 295, 286};
        int[] y_2 = {352, 352, 390, 390};

        g.setColor(Color.black);
        g.fillPolygon(x_2, y_2, x_2.length);

        g.setColor(Color.black);
        g.drawPolygon(x_2, y_2, x_2.length);



        int[] x_3 = {307, 316, 316, 307};
        int[] y_3 = {352, 352, 389 ,389};

        g.setColor(Color.black);
        g.fillPolygon(x_3, y_3, x_3.length);

        g.setColor(Color.black);
        g.drawPolygon(x_3, y_3, x_3.length);



        //left side

        int[] x_4 = {252, 247, 245, 245, 250, 251, 253};
        int[] y_4 = {382, 378, 364, 346, 349, 366, 383};

        g.setColor(Color.black);
        g.fillPolygon(x_4, y_4, x_4.length);

        g.setColor(Color.black);
        g.drawPolygon(x_4, y_4, x_4.length);


        int[] x_5 = {239, 237, 230, 234};
        int[] y_5 = {369, 339, 336, 364};

        g.setColor(Color.black);
        g.fillPolygon(x_5, y_5, x_5.length);

        g.setColor(Color.black);
        g.drawPolygon(x_5, y_5, x_5.length);



        int[] x_6 = {227, 222, 219, 225};
        int[] y_6 = {355, 351, 326, 329};

        g.setColor(Color.black);
        g.fillPolygon(x_6, y_6, x_6.length);

        g.setColor(Color.black);
        g.drawPolygon(x_6, y_6, x_6.length);


        int[] x_7 = {215, 210, 208, 212};
        int[] y_7 = {341, 338, 317, 319};

        g.setColor(Color.black);
        g.fillPolygon(x_7, y_7, x_7.length);

        g.setColor(Color.black);
        g.drawPolygon(x_7, y_7, x_7.length);




        //Right Side
        int[] x_8 = {333, 338, 334, 328};
        int[] y_8 = {349, 346, 379, 384};

        g.setColor(Color.black);
        g.fillPolygon(x_8, y_8, x_8.length);

        g.setColor(Color.black);
        g.drawPolygon(x_8, y_8, x_8.length);


        int[] x_9 = {346, 351, 348, 342};
        int[] y_9 = {338, 334, 365, 368};

        g.setColor(Color.black);
        g.fillPolygon(x_9, y_9, x_9.length);

        g.setColor(Color.black);
        g.drawPolygon(x_9, y_9, x_9.length);

        int[] x_10 = {354, 359, 360, 356};
        int[] y_10 = {356, 351, 326, 331};

        g.setColor(Color.black);
        g.fillPolygon(x_10, y_10, x_10.length);

        g.setColor(Color.black);
        g.drawPolygon(x_10, y_10, x_10.length);

        int[] x_11 = {365, 366, 371, 369};
        int[] y_11 = {345, 322, 316, 341};

        g.setColor(Color.black);
        g.fillPolygon(x_11, y_11, x_11.length);

        g.setColor(Color.black);
        g.drawPolygon(x_11, y_11, x_11.length);









        //YELLOW EYES
        //LeftSide
        int[] x_eyes = {263, 247, 214, 239, 263};
        int[] y_eyes = {302, 309, 280, 282, 302};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_eyes, y_eyes, x_eyes.length);

        g.setColor(Color.black);
        g.drawPolygon(x_eyes, y_eyes, x_eyes.length);



        //Right side of yellow eyes

        int[] x_eyes1 = {316, 333, 367, 335, 316};
        int[] y_eyes1 = {304, 311, 281, 287, 304};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_eyes1, y_eyes1, x_eyes1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_eyes1, y_eyes1, x_eyes1.length);


        //Eyes shade
        int[] x_eyesh = {335, 338, 334, 332};
        int[] y_eyesh = {290, 290, 311 ,311};

        g.setColor(new Color(228, 198, 84));
        g.fillPolygon(x_eyesh, y_eyesh, x_eyesh.length);


        int[] x_eyesh2 = {240, 243, 250, 246};
        int[] y_eyesh2 = {286, 286, 310, 310};

        g.setColor(new Color(228, 198, 84));
        g.fillPolygon(x_eyesh2, y_eyesh2, x_eyesh2.length);







        //SMILE IN HEAD
        int[] x_sm = {305, 305, 272, 272};
        int[] y_sm = {252, 261, 261, 252};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_sm, y_sm, x_sm.length);


        g.setColor(new Color(219, 147, 29));
        g.drawPolygon(x_sm, y_sm, x_sm.length);


        int[] x_sm1 = {320, 318, 337, 337};
        int[] y_sm1 = {252, 257, 254, 249};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_sm1, y_sm1, x_sm1.length);


        g.setColor(new Color(219, 147, 29));
        g.drawPolygon(x_sm1, y_sm1, x_sm1.length);




        int[] x_sm2 = {257, 257, 236, 239};
        int[] y_sm2 = {257, 251, 245, 250};

        g.setColor(new Color(219, 147, 29));
        g.fillPolygon(x_sm2, y_sm2, x_sm2.length);


        g.setColor(new Color(219, 147, 29));
        g.drawPolygon(x_sm2, y_sm2, x_sm2.length);








        //Glasses Shade


        int[] x_glass3 = {313, 334, 368, 335, 307, 313};
        int[] y_glass3 = {303, 311, 282, 317, 307, 303};


        g.setColor(new Color(31, 36, 40));
        g.fillPolygon(x_glass3, y_glass3, x_glass3.length);
        g.drawPolygon(x_glass3, y_glass3, x_glass3.length);

        g.setColor(Color.black);
        g.drawPolygon(x_glass3, y_glass3, x_glass3.length);




        int[] x_glass4 = {265, 247, 210, 212, 244, 262, 265};
        int[] y_glass4 = {306, 314, 278, 278, 309, 304, 306};


        g.setColor(new Color(31, 36, 40));
        g.fillPolygon(x_glass4, y_glass4, x_glass4.length);
        g.drawPolygon(x_glass4, y_glass4, x_glass4.length);

        g.setColor(Color.black);
        g.drawPolygon(x_glass4, y_glass4, x_glass4.length);






        //Glasses
        //LeftSide
        int[] x_glass = {236, 241, 278, 278, 236};
        int[] y_glass = {284, 281, 308, 313, 284};


        g.setColor(new Color(31, 36, 40));
        g.fillPolygon(x_glass, y_glass, x_glass.length);
        g.drawPolygon(x_glass, y_glass, x_glass.length);

        g.setColor(Color.black);
        g.drawPolygon(x_glass, y_glass, x_glass.length);



       // Right Side
        int[] x_glass2 = {300, 337, 367, 364, 341, 328, 296, 299};
        int[] y_glass2 = {313, 287, 280, 269, 275, 287, 305, 313};


        g.setColor(new Color(31, 36, 40));
        g.fillPolygon(x_glass2, y_glass2, x_glass2.length);
        g.drawPolygon(x_glass2, y_glass2, x_glass2.length);

        g.setColor(Color.black);
        g.drawPolygon(x_glass2, y_glass2, x_glass2.length);




        //GREY HEAD CORONA
        //LeftSide
        int[] x_cor = {254, 244, 238, 217, 202, 187, 176, 171, 171, 160, 138, 118, 117, 127, 140, 155, 180, 192, 211, 234, 254};
        int[] y_cor = {284, 258, 242, 223, 214, 176, 148, 138, 133, 132, 138, 141, 143, 168, 196, 224, 245, 268, 278, 285, 284};

        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_cor, y_cor, x_cor.length);

        g.setColor(Color.black);
        g.drawPolygon(x_cor, y_cor, x_cor.length);





        //Right Side
        int[] x_cor1 = {326, 345, 378, 408, 413, 420, 441, 456, 456, 443, 430, 423, 408, 390, 386, 366, 348, 327, 326};
        int[] y_cor1 = {286, 236, 212, 130, 130, 133, 137, 140, 151, 183, 207, 220, 235, 266, 270, 280, 281, 285, 286};

        g.setColor(new Color(155, 155, 163));
        g.fillPolygon(x_cor1, y_cor1, x_cor1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_cor1, y_cor1, x_cor1.length);




        //GREY HEAD SHADES
        int[] x_hSh = {422, 394, 351, 336, 326, 342, 377, 408, 422};
        int[] y_hSh = {134, 215, 246, 286, 285, 237, 210, 132, 134};


        g.setColor(new Color(209, 215, 215));
        g.fillPolygon(x_hSh, y_hSh, x_hSh.length);

        g.setColor(Color.lightGray);
        g.drawPolygon(x_hSh, y_hSh, x_hSh.length);


        int[] x_hSh1 = {378, 393, 414, 418, 415, 407, 378};
        int[] y_hSh1 = {212, 216, 152, 135, 132, 132, 212};


        g.setColor(Color.lightGray);
        g.fillPolygon(x_hSh1, y_hSh1, x_hSh1.length);



        int[] x_hSh2 = {344, 351, 342, 336, 332, 327, 331, 335, 341, 344};
        int[] y_hSh2 = {238, 244, 264, 284, 286, 284, 268, 258, 246, 238};


        g.setColor(Color.lightGray);
        g.fillPolygon(x_hSh2, y_hSh2, x_hSh2.length);






        //left side
        int[] x_hSh4 = {171, 169, 159, 159, 169, 181, 185, 197, 225, 238, 240, 241, 246, 253, 247, 238, 231, 211, 202, 189, 183, 168, 171};
        int[] y_hSh4 = {136, 132, 133, 141, 179, 209, 217, 226, 244, 265, 276, 283, 286, 287, 266, 244, 235, 220, 214, 182, 166, 131, 136};


        g.setColor(new Color(209, 215, 215));
        g.fillPolygon(x_hSh4, y_hSh4, x_hSh4.length);

        g.setColor(Color.lightGray);
        g.drawPolygon(x_hSh4, y_hSh4, x_hSh4.length);






        //NOSE
        int[] x_nose = {277, 301, 309, 302, 279, 273, 277};
        int[] y_nose = {308, 308, 332, 342, 342, 333, 308};


        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_nose, y_nose, x_nose.length);
        g.drawPolygon(x_nose, y_nose, x_nose.length);

        g.setColor(Color.black);
        g.drawPolygon(x_nose, y_nose, x_nose.length);



        int[] x_nose1 = {280, 280, 299, 299};
        int[] y_nose1 = {300, 339, 339, 300};


        g.setColor(new Color(32, 44, 82));
        g.fillPolygon(x_nose1, y_nose1, x_nose1.length);
        g.drawPolygon(x_nose1, y_nose1, x_nose1.length);

        g.setColor(Color.black);
        g.drawPolygon(x_nose1, y_nose1, x_nose1.length);




        //Corona GREY Shades
        int[] x_shsh7 = {397, 428, 409, 397};
        int[] y_shsh7 = {215, 210, 218, 215};

        g.setColor(Color.gray);
        g.fillPolygon(x_shsh7, y_shsh7, x_shsh7.length);

        int[] x_shsh8 = {153, 165, 183, 183, 170};
        int[] y_shsh8 = {216, 216, 217, 221, 221};

        g.setColor(Color.gray);
        g.fillPolygon(x_shsh8, y_shsh8, x_shsh8.length);







        //Smile
        int[] x_shsh01 = {263, 291, 325, 316, 293, 257, 263};
        int[] y_shsh01 = {284, 293, 284, 290, 296, 286, 284};

        g.setColor(Color.gray.darker());
        g.fillPolygon(x_shsh01, y_shsh01, x_shsh01.length);









    }




}





public class Main {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.show();
    }
}
