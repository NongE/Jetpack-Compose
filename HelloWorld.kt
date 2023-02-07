class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyJetpackCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Hello("Compose")
                }
            }
        }
    }

    @Composable
    fun Hello(string: String){
        MyJetpackCompose1Theme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Hello")
                // Spacer(modifier = Modifier.height(8.dp))
                Text(string)
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewExample(){
        MyJetpackCompose1Theme {
            Hello("Test")
        }
    }
}