class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .fillMaxWidth()
                    .height(180.dp)
            ) {
                Text("Hello")
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    contentAlignment = Alignment.BottomEnd
                ){
                    Text("Hi------")
                }
            }
        }
    }
}