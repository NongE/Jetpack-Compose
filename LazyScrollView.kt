class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyScrollView()
        }
    }

    @Composable
    fun LazyScrollView(){
        LazyColumn(
            modifier = Modifier
                .background(color = Color.Gray)
                .fillMaxWidth(),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text("Header area")
            }

            items(30){ index ->
                Text("Hello LazyColumn $index")
            }

            item {
                Text("Footer area")
            }
        }
    }
}