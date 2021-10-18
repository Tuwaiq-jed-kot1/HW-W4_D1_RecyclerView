import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hw1weak4.R
import com.shady.hw_week04_day01_recyclerviewiml.R
import layout.Cart

class CartRecycleViewAdapter(private val cartList: List<Cart>):
    RecyclerView.Adapter<CartAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter {
        return CartAdapter.(view)
    }

    override fun onBindViewHolder(holder: CartAdapter, position: Int) {
        val cart=cartList[position]
holder.productTextView.text= cart.Product.toString()
        holder.ColorrTextView.text= cart.Colorr.toString()
        holder.PriceTextView.text= cart.Price.toString()
    }

    override fun getItemCount(): Int {
return cartList.size
    }
}
class  CartAdapter(itemView: View): RecyclerView.ViewHolder(itemView),
        View.OnClickListener{
        val productTextView: TextView = itemView.findViewById(R.id.tvproduct)
        val ColorrTextView: TextView = itemView.findViewById(R.id.tvcolor)
        val PriceTextView: TextView = itemView.findViewById(R.id.tvprice)
        override fun onClick(p0: View?) {
Toast.makeText(itemView.context,"${productTextView.text}",Toast.LENGTH_LONG).show()
        }


    }