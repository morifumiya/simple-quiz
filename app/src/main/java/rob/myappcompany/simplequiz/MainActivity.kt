package rob.myappcompany.simplequiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val quizData = arrayOf("a0", "a1", "a2", "a3")
    private   var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) view取得 + カウント用のiを用意
        val tvCount: TextView = findViewById(R.id.tvCount)
        val tvQuestion: TextView = findViewById(R.id.tvQuestion)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
//        var i = 0

        // 2) 配列
//        val quizData = arrayOf("a0", "a1", "a2", "a3")

        // 4) リストを用意してシャッフル
        val list = listOf(0, 1, 2, 3)
        val num = list.shuffled()

        //3) 表示
        btn0.text = quizData[num[0]]
        btn1.text = quizData[num[1]]
        btn2.text = quizData[num[2]]
        btn3.text = quizData[num[3]]


        btn0.setOnClickListener {
            if (btn0.text == quizData[i]) {
                correctAns()
                i++
                btn0.isEnabled = false
                tvCount.text = i.toString() + "問正解!"
                if (i == 4) {
                    tvQuestion.text = "全問正解! Game Clear!!"
                }

            } else {
                incorrectAns()
            }
        }

        btn1.setOnClickListener {
            if (btn1.text == quizData[i]) {
                correctAns()
                i++
                btn1.isEnabled = false
                tvCount.text = i.toString() + "問正解!"

                if (i == 4) {
                    tvQuestion.text = "全問正解! Game Clear!!"
                }
            } else {
                incorrectAns()
            }
        }

        btn2.setOnClickListener {
            if (btn2.text == quizData[i]) {
                correctAns()
                i++
                btn2.isEnabled = false
                tvCount.text = i.toString() + "問正解!"
                if (i == 4) {
                    tvQuestion.text = "全問正解! Game Clear!!"
                }
            } else {
                incorrectAns()
            }
        }

        btn3.setOnClickListener {
            if (btn3.text == quizData[i]) {
                correctAns()
                i++
                btn3.isEnabled = false
                tvCount.text = i.toString() + "問正解!"
                if (i == 4) {
                    tvQuestion.text = "全問正解! Game Clear!!"
                }
            } else {
                incorrectAns()
            }
        }

    }

    private fun correctAns() {
        AlertDialog.Builder(this)
            .setTitle("正解!")
            .setMessage(quizData[i])
            .setPositiveButton("OK", null)
            .show()
    }

    // 10) 不正解処理の関数
    private fun incorrectAns() {
        val tvQuestion: TextView = findViewById(R.id.tvQuestion)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)

        // 不正解+ボタンの無効化
        tvQuestion.text = "不正解! Game Over"
        btn0.isEnabled = false
        btn1.isEnabled = false
        btn2.isEnabled = false
        btn3.isEnabled = false
    }
}
