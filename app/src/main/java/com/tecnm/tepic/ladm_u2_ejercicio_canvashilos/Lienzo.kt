package com.tecnm.tepic.ladm_u2_ejercicio_canvashilos

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.View

class Lienzo (p:MainActivity) : View(p){

    val principal = p
    var catrina = BitmapFactory.decodeResource(principal.resources,R.drawable.catrina)
    var tumba = BitmapFactory.decodeResource(this.resources,R.drawable.tumbas)
    var catrin = BitmapFactory.decodeResource(principal.resources,R.drawable.catrin)

    var incrementoNube = 0
    var decrementoNube = 0
    var posXCatrina = 1280f
    var posXCatrin = 100f

    val moverCatrina = object  : CountDownTimer(2000, 80){
        override fun onTick(p0: Long) {
            posXCatrina -= 5
            incrementoNube += 1
            decrementoNube -= 1
            if(posXCatrina <-500) posXCatrina = 1200f
            invalidate() //forza al onDraw a volver a pintar
        }

        override fun onFinish() {
            start()
        }

    }
    val moverCatrin = object  : CountDownTimer(2000, 80){
        override fun onTick(p0: Long) {
            posXCatrin += 5
            if(posXCatrin <- 500) posXCatrin = 100f
            invalidate() //forza al onDraw a volver a pintar
        }

        override fun onFinish() {
            start()
        }

    }

    //INVOCAR EL CONSTRUCTOR
    init {
        moverCatrina.start()
        moverCatrin.start()
    }


    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()

        c.drawColor(Color.BLACK)

        //LUNA
        p.color = Color.WHITE
        c.drawCircle(700f,600f, 550f, p)

        //PISO
        p.color = Color.rgb(134,137,93)
        c.drawOval(-150f,277f,1000f,800f,p)
        c.drawOval(400f,277f,1700f,800f,p)

        //ARBOLES
        p.color = Color.rgb(161,130,98)
        c.drawRect(50f,350f,80f,230f,p)
        c.drawRect(200f,300f,230f,200f,p)
        c.drawRect(1200f,300f,1230f,200f,p)
        c.drawRect(1350f,320f,1385f,210f,p)

        p.color = Color.rgb(45,87,44)
        c.drawCircle(50f,200f,50f,p)
        c.drawCircle(90f,205f,50f,p)
        c.drawCircle(68f,195f,50f,p)

        c.drawCircle(190f,190f,50f,p)
        c.drawCircle(230f,195f,50f,p)
        c.drawCircle(208f,175f,50f,p)

        c.drawCircle(1190f,190f,50f,p)
        c.drawCircle(1230f,195f,50f,p)
        c.drawCircle(1208f,175f,50f,p)

        c.drawCircle(1190f,190f,50f,p)
        c.drawCircle(1230f,195f,50f,p)
        c.drawCircle(1208f,175f,50f,p)

        c.drawCircle(1330f,210f,50f,p)
        c.drawCircle(1400f,215f,50f,p)
        c.drawCircle(1360f,190f,50f,p)

        //NUBES
        //p.color = Color.LTGRAY
        p.color = Color.rgb(82,82,82)
        c.drawOval(10f + incrementoNube,10f,84f + incrementoNube,60f,p)
        c.drawOval(20f + incrementoNube,5f,95f + incrementoNube,58f,p)
        c.drawOval(20f + incrementoNube,15f,90f + incrementoNube,65f,p)
        c.drawOval(20f + incrementoNube,10f,105f + incrementoNube,60f,p)

        c.drawOval(310f + incrementoNube,20f,384f + incrementoNube,70f,p)
        c.drawOval(320f + incrementoNube,15f,395f + incrementoNube,68f,p)
        c.drawOval(320f + incrementoNube,25f,390f + incrementoNube,75f,p)
        c.drawOval(320f + incrementoNube,20f,405f + incrementoNube,70f,p)

        c.drawOval(610f + decrementoNube,70f,684f+ decrementoNube,120f,p)
        c.drawOval(620f+ decrementoNube,65f,695f+ decrementoNube,118f,p)
        c.drawOval(620f+ decrementoNube,75f,690f+ decrementoNube,125f,p)
        c.drawOval(620f+ decrementoNube,70f,705f+ decrementoNube,120f,p)

        c.drawOval(810f + incrementoNube,20f,884f + incrementoNube,70f,p)
        c.drawOval(820f + incrementoNube,15f,895f + incrementoNube,68f,p)
        c.drawOval(820f + incrementoNube,25f,890f + incrementoNube,75f,p)
        c.drawOval(820f + incrementoNube,20f,905f + incrementoNube,70f,p)

        c.drawOval(1310f+ decrementoNube,70f,1384f+ decrementoNube,120f,p)
        c.drawOval(1320f+ decrementoNube,65f,1395f+ decrementoNube,118f,p)
        c.drawOval(1320f+ decrementoNube,75f,1390f+ decrementoNube,125f,p)
        c.drawOval(1320f+ decrementoNube,70f,1405f+ decrementoNube,120f,p)

        //CEMPASUCHIL

        p.color =   Color.rgb(255,128,0)
        c.drawCircle(200f,300f,5f,p)
        c.drawCircle(210f,300f,5f,p)
        c.drawCircle(220f,300f,5f,p)
        c.drawCircle(230f,300f,5f,p)
        c.drawCircle(205f,295f,5f,p)
        c.drawCircle(215f,295f,5f,p)
        c.drawCircle(225f,295f,5f,p)

        c.drawCircle(50f,350f,5f,p)
        c.drawCircle(60f,350f,5f,p)
        c.drawCircle(70f,350f,5f,p)
        c.drawCircle(80f,350f,5f,p)
        c.drawCircle(55f,345f,5f,p)
        c.drawCircle(65f,345f,5f,p)
        c.drawCircle(75f,345f,5f,p)

        c.drawCircle(1200f,300f,5f,p)
        c.drawCircle(1210f,300f,5f,p)
        c.drawCircle(1220f,300f,5f,p)
        c.drawCircle(1230f,300f,5f,p)
        c.drawCircle(1205f,295f,5f,p)
        c.drawCircle(1215f,295f,5f,p)
        c.drawCircle(1225f,295f,5f,p)

        c.drawCircle(1350f,320f,5f,p)
        c.drawCircle(1360f,320f,5f,p)
        c.drawCircle(1370f,320f,5f,p)
        c.drawCircle(1380f,320f,5f,p)
        c.drawCircle(1355f,315f,5f,p)
        c.drawCircle(1365f,315f,5f,p)
        c.drawCircle(1375f,315f,5f,p)

        c.drawBitmap(tumba,100f,300f,p)
        c.drawBitmap(tumba,350f,300f,p)
        c.drawBitmap(tumba,500f,270f,p)
        c.drawBitmap(tumba,700f,340f,p)
        c.drawBitmap(tumba,900f,270f,p)
        c.drawBitmap(tumba,1010f,300f,p)
        c.drawBitmap(tumba,1010f,300f,p)
        c.drawBitmap(tumba,1280f,260f,p)

        c.drawBitmap(catrin,posXCatrin,270f,p)
        c.drawBitmap(catrina,posXCatrina,270f,p)

    }

}