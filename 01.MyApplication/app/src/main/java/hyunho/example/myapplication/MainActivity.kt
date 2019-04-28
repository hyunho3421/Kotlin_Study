package hyunho.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * kotlin에서는 extends 대신에 :(콜론)을 사용하여 상속을 나타낸다.
 * MainActivity는 AppCompatActivity 클래스를 상속받음.
 *
 * AppCompatActivity 클래스는 구 버전 안드로이드 기기에서도 최신 기능을 쓸 수 있게 해주는 기능을 제공.
 * 하위호환 되는 앱을 만드려면 반드시 AppCompatActivity 클래스를 상속받아야한다.
 */
class MainActivity : AppCompatActivity() {

    /**
     * override 구문은 코틀린에서 메서드를 오버라이드 할때 붙이는 키워드.
     *
     * onCreate() 메서드는 액티비티가 시작되면 최초로 호출되는 메서드.
     */
    override fun onCreate(savedInstanceState: Bundle?) {

        /**
         * onCreate() 메서드에서는 반드시 부모클래스의 생성자를 호출해야 한다.
         */
        super.onCreate(savedInstanceState)

        /**
         * 액티비티가 표시할 레이아웃 파일을 지정한다.
         *
         * 여기서 R이란 안드로이드 스튜디오에서 자동으로 생성되는 리소스 정보가 정수형 ID로 저장되어 있어
         * 이를 참조하여 코드에서 리소스 파일에 접근할 수 있다.
         * 레이아웃, 메뉴, 그림, 문자열 모두 R 클래스를 사용해 코드에서 조작할 수 있다.
         */
        setContentView(R.layout.activity_main)

        clickButton.setOnClickListener {
            helloWorld.text = "버튼을 눌렀습니다."
        }
    }
}
