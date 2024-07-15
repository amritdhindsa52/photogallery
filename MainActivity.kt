import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val images = fetchImages()
        imageAdapter = ImageAdapter(images)
        recyclerView.adapter = imageAdapter
    }

    private fun fetchImages(): List<Image> {
        // Replace this with actual image fetching logic
        return listOf(
            Image("https://example.com/image1.jpg"),
            Image("https://example.com/image2.jpg"),
            // Add more images
        )
    }
}
