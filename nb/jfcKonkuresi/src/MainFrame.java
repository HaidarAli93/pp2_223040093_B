import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Contoh Konkuresi di Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new BorderLayout());
            
            JLabel statusLabel = new JLabel("Tekan tombol untuk tugas berat", JLabel.CENTER);
            JButton startBtn = new JButton("Mulai");
            JProgressBar progresBar = new JProgressBar(0, 60);
            progresBar.setValue(0);
            progresBar.setStringPainted(true);
            
            frame.add(statusLabel, BorderLayout.NORTH);
            frame.add(progresBar, BorderLayout.CENTER);
            frame.add(startBtn, BorderLayout.SOUTH);
            
            startBtn.addActionListener(e -> {
                startBtn.setEnabled(false);
                statusLabel.setText("Proses Berjalan...");
                
                SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        for (int i = 0; i <= 100; i++) {
                            Thread.sleep(50);
                            publish(i);
                        }
                        return null;
                    }
                    
                    @Override
                    protected void process(List<Integer> chunks) {
                        int latestProgress = chunks.get(chunks.size() -1);
                        progresBar.setValue(latestProgress);
                    }
                    
                    @Override
                    protected void done() {
                        startBtn.setEnabled(true);
                        statusLabel.setText("Proses Selesai!");
                    }
                };
                
                worker.execute();
            });
            
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
