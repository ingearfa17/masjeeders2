import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bagicode.www.bagitraveloka.R;
import com.bumptech.glide.Glide;

import java.text.StringCharacterIterator;
import java.util.List;

/**
 * Created by Inge on 16/05/2018.
 */

public class kajianadapter extends  RecyclerView.Adapter<kajianAdapter.ViewHolder>{
    private List<kajianmodel> listCar;
    private Context context;

    public KajianAdapter(List<kajianmodel> listkajian, Context context) {
        this.listKajian = listkajian;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_item_kajian_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        kajianmodel kajian  = listkajian.get(position);


        kajianmodel ustad;
        holder.tvUstadName.setText("Name : " + ustad.getUstadName());
        kajianmodel masjid;
        holder.tvMasjidName.setText("Name : " + masjid.getMasjidName());
        holder.tvLokasiMasjid.setText("lokasi : " + masjid.getLokasiMasjid());

        Glide.with(context)
                .load(kajian.getKajianImage())
                .into(holder.ivKajian);

        holder.tvCarAvailability.setText("Available Here : " + car.getCarAvailable());

        //on click linear layout to check the position
        holder.llCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCar.size();
    }

    // inner class of adapter
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView ivKajian;
        public TextView tvKajianName;
        public TextView tvUstadName;
        public TextView tvCarQty;
        public TextView tvCarAvailability;
        public LinearLayout llCar;
        public StringCharacterIterator tvUstadName;
        public StringCharacterIterator tvMasjidName;
        public StringCharacterIterator tvLokasiMasjid;
        public int ivKajian;

        public ViewHolder(View itemView) {
            super(itemView);

            ivCar = (ImageView) itemView.findViewById(R.id.image_view_car);
            tvCarName = (TextView) itemView.findViewById(R.id.text_view_car_name);
            tvCarPrice = (TextView) itemView.findViewById(R.id.text_view_car_price);
            tvCarQty = (TextView) itemView.findViewById(R.id.text_view_car_qty);
            tvCarAvailability = (TextView) itemView.findViewById(R.id.text_view_car_available);
            llCar = (LinearLayout) itemView.findViewById(R.id.ll_car);
        }
    }
}
