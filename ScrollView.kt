class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()

            ScrollView(scrollState)
        }
    }

    @Composable
    fun ScrollView(scrollState: ScrollState){
        Column(
            modifier = Modifier
                .background(color = Color.Gray)
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ) {
            for(i in 0 until 30){
                Text("Hello $i")
            }
        }
    }
}